package edu.odu.cs.cs350;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


class TokenTest {

    @Test
    void testTokenCreation() {
        Token token = new Token("KEYWORD", "if", 1, 1);
        assertEquals("KEYWORD", token.getKind());
        assertEquals("if", token.getLexeme());
        assertEquals(1, token.getLineNumber());
        assertEquals(1, token.getColumnNumber());
    }

    @Test
    void testToString() {
        Token token = new Token("IDENTIFIER", "variable", 3, 15);
        assertEquals("IDENTIFIER(variable) at 3:15", token.toString());
    }
}
