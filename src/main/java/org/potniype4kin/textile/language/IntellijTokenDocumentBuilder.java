package org.potniype4kin.textile.language;

import com.intellij.psi.tree.IElementType;
import net.java.textilej.parser.Attributes;
import net.java.textilej.parser.DocumentBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IntellijTokenDocumentBuilder extends DocumentBuilder {
    private final List<String> tokens = new ArrayList<>();

    @Override
    public void beginDocument() {
        tokens.add("begin document");
    }

    @Override
    public void endDocument() {
        tokens.add("end document");
    }

    @Override
    public void beginBlock(BlockType type, Attributes attributes) {
        String attrs = printAttrs(attributes);
        tokens.add("begin block " + type + ", attrs: " + attrs);
    }

    @Override
    public void endBlock() {
        tokens.add("end block");
    }

    @Override
    public void beginSpan(SpanType type, Attributes attributes) {
        String attrs = printAttrs(attributes);
        tokens.add("begin span " + type + ", attrs: " + attrs);
    }

    @Override
    public void endSpan() {
        tokens.add("end span");
    }

    @Override
    public void beginHeading(int level, Attributes attributes) {
        String attrs = printAttrs(attributes);
        tokens.add("begin heading " + level + ", attrs: " + attrs);
    }

    @Override
    public void endHeading() {
        tokens.add("end heading");
    }

    @Override
    public void characters(String text) {
        tokens.add("characters: " + text);
    }

    @Override
    public void entityReference(String entity) {
        tokens.add("entity reference: " + entity);
    }

    @Override
    public void image(Attributes attributes, String url) {
        String attrs = printAttrs(attributes);
        tokens.add("image: " + url + ", attrs: " + attrs);

    }

    @Override
    public void link(Attributes attributes, String hrefOrHashName, String text) {
        tokens.add("link: " + hrefOrHashName + ", link text: " + text + ", attrs: " + printAttrs(attributes));
    }

    @Override
    public void imageLink(Attributes linkAttributes, Attributes imageAttributes, String href, String imageUrl) {
        tokens.add("image link: " + href + ", image url: " + imageUrl + ", link attrs: " + printAttrs(linkAttributes) + ", image attrs: " + imageAttributes);
    }

    @Override
    public void acronym(String text, String definition) {
        tokens.add("acronym: " + text + ", definition: " + definition);
    }

    @Override
    public void lineBreak() {
        tokens.add("line break");
    }

    @Override
    public void charactersUnescaped(String literal) {
        tokens.add("unescaped chars: " + literal);
    }

    private String printAttrs(Attributes attributes) {
        return "CssClass: " + attributes.getCssClass() +
                ", CssStyle: " + attributes.getCssStyle() +
                ", Id: " + attributes.getId() +
                ", Language: " + attributes.getLanguage() +
                ", Title: " + attributes.getTitle();
    }

    @Override
    public String toString() {
        return String.join("\n", tokens);
    }

    public Queue<IElementType> getTokens() {
        return new LinkedList<>();
    }
}
