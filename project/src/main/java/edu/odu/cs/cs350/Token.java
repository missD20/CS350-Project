package edu.odu.cs.cs350;

/**
 * Represents a token in the source code with kind as a simple string.
 */
public class Token {
    private String kind;         // previously TokenKind kind;
    private String lexeme;
    private int lineNumber;
    private int columnNumber;

    /**
     * Token objects
     */
    public Token(String kind, String lexeme, int lineNumber, int columnNumber) {
        this.kind = kind;
        this.lexeme = lexeme;
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public String getKind() {
        return kind;
    }

    public String getLexeme() {
        return lexeme;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    @Override
    public String toString() {
        return kind + "(" + lexeme + ") at " + lineNumber + ":" + columnNumber;
    }
}
