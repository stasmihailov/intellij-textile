package net.java.textilej.parser.markup.confluence.phrase;

import java.util.regex.Pattern;

import net.java.textilej.parser.Attributes;
import net.java.textilej.parser.DocumentBuilder.SpanType;
import net.java.textilej.parser.markup.PatternBasedElementProcessor;
import net.java.textilej.parser.markup.PatternBasedElement;


public class SimpleWrappedPhraseModifier extends PatternBasedElement {

	protected static final int CONTENT_GROUP = 1;
	
	private static class SimplePhraseModifierProcessor extends PatternBasedElementProcessor {
		private final SpanType spanType;
		
		public SimplePhraseModifierProcessor(SpanType spanType) {
			this.spanType = spanType;
		}
		
		@Override
		public void emit() {
			Attributes attributes = new Attributes();
			getBuilder().beginSpan(spanType, attributes);
			getDialect().emitMarkupText(parser, state, getContent(this));
			getBuilder().endSpan();
		}
	}
	
	private String startDelimiter;
	private String endDelimiter;
	private SpanType spanType;
	
	public SimpleWrappedPhraseModifier(String startDelimiter,String endDelimiter, SpanType spanType) {
		this.startDelimiter = startDelimiter;
		this.endDelimiter = endDelimiter;
		this.spanType = spanType;
	}

	@Override
	protected String getPattern(int groupOffset) {
		return 
		Pattern.quote(startDelimiter) +
		"([^\\s-](?:.*?[^\\s-])?)" + // content: note that we dont allow preceding '-' or trailing '-' to avoid conflict with strikethrough and emdash
		Pattern.quote(endDelimiter);
	}

	@Override
	protected int getPatternGroupCount() {
		return 1;
	}
	
	protected static String getContent(PatternBasedElementProcessor processor) {
		return processor.group(CONTENT_GROUP);
	}
	
	@Override
	protected PatternBasedElementProcessor newProcessor() {
		return new SimplePhraseModifierProcessor(spanType);
	}
}
