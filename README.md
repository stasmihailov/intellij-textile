### Textile language support

[![Travis Build Status](https://travis-ci.com/stasmihailov/intellij-textile.svg?branch=master)](https://travis-ci.com/github/stasmihailov/intellij-textile)
[![JetBrains IntelliJ Plugin Link](https://img.shields.io/jetbrains/plugin/d/com.potniype4kin.intellij-textile)](https://plugins.jetbrains.com/plugin/14204)

Adds support for Textile markup to Jetbrains IDEs

### Main features
* adds Confluence-like code highlighing
* adds ability to generate HTML from textile document by "Generate HTML from this file" intention action

### Checklist of supported Textile features (as per [textile website](https://textile-lang.com)/)

#### Block modifiers
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[x] item1</li><li>[ ] item2</li></ul> | --- | --- |
| <ul><li>[x] item1</li></ul> | --- | --- |
| <ul><li>[x] item1 | --- | --- |
| <ul><li>[x] | `<0.1.3-RELEASE` | [Paragraphs](https://textile-lang.com/doc/paragraphs) |
| <ul><li>[x] | `<0.1.3-RELEASE` | [Headings](https://textile-lang.com/doc/headings) |
| <ul><li>[ ] | | [Pre-formatted text](https://textile-lang.com/doc/pre-formatted-text) |
| <ul><li>[x] | `<0.1.3-RELEASE` | [Block code](https://textile-lang.com/doc/block-code) |
| <ul><li>[ ] | | [Block quotations](https://textile-lang.com/doc/block-quotations) |
| <ul><li>[ ] | | [Textile comments](https://textile-lang.com/doc/textile-comments) |
| <ul><li>[ ] | | [No formatting (override Textile)](https://textile-lang.com/doc/no-textile-processing) |
| <ul><li>[ ] | | [HTML](https://textile-lang.com/doc/html) |

#### Lists and notes
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[x] | `<0.1.3-RELEASE` | [Bulleted (unordered) lists](https://textile-lang.com/doc/bulleted-unordered-lists) |
| <ul><li>[ ] | | [Numbered (ordered) lists](https://textile-lang.com/doc/numbered-ordered-lists) |
| <ul><li>[ ] | | [Definition lists](https://textile-lang.com/doc/definition-lists) |
| <ul><li>[ ] | | [Footnotes](https://textile-lang.com/doc/footnotes) |
| <ul><li>[ ] | | [Endnotes (auto-numbered notes)](https://textile-lang.com/doc/auto-numbered-notes) |

#### Links and images
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[ ] | | [Links](https://textile-lang.com/doc/links) |
| <ul><li>[ ] | | [Images](https://textile-lang.com/doc/images) |

#### Tables
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[ ] | | [Tables](https://textile-lang.com/doc/tables) |

#### Phrase modifiers
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[ ] | | [Strong and bold text](https://textile-lang.com/doc/strong-and-bold-text) |
| <ul><li>[ ] | | [Emphasized and italic text](https://textile-lang.com/doc/emphasized-and-italic-text) |
| <ul><li>[ ] | | [Superscript and subscript text](https://textile-lang.com/doc/subscript-and-superscript-text) |
| <ul><li>[ ] | | [Insertions and deletions](https://textile-lang.com/doc/insertions-and-deletions) |
| <ul><li>[ ] | | [Citations](https://textile-lang.com/doc/citations) |
| <ul><li>[ ] | | [Acronyms and abbreviations](https://textile-lang.com/doc/acronyms-abbreviations) |
| <ul><li>[ ] | | [Inline code](https://textile-lang.com/doc/inline-code) |

#### Attributes
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[ ] | | [Alignment](https://textile-lang.com/doc/text-alignment) |
| <ul><li>[ ] | | [Indentation](https://textile-lang.com/doc/indentation) |
| <ul><li>[ ] | | [Spans](https://textile-lang.com/doc/spans) |
| <ul><li>[ ] | | [CSS styles](https://textile-lang.com/doc/css-styles) |
| <ul><li>[ ] | | [Class and ID attributes](https://textile-lang.com/doc/classes-and-ids) |
| <ul><li>[ ] | | [Language](https://textile-lang.com/doc/language) |

#### Typography
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[ ] | | [Character conversions](https://textile-lang.com/doc/special-characters) |
| <ul><li>[ ] | | [Unicode symbols](https://textile-lang.com/doc/unicode-symbols) |
| <ul><li>[ ] | | [Uppercase words](https://textile-lang.com/doc/uppercase-words) |

#### Additional support of Confluence features
| supported? | when was it added? | feature |
| --- | --- | --- |
| <ul><li>[x] | `<0.1.3-RELEASE` | `{code}` macro |
| <ul><li>[x] | `<0.1.3-RELEASE` | `{info}` macro |
| <ul><li>[ ] | | ticker(\`)- and double-brace(`{{`)-style inline code |
