package com.ctci.arraysandstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {
    // assuming the string contains only ASCII characters
    // mix of statement coverage + condition coverage
    @Test
    void stringNull(){
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.hasAllUniqueCharacters(null));
    }
    @Test
    void stringWith129Chars(){
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.hasAllUniqueCharacters("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }
    @Test
    void stringWithDuplicateChars(){
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.hasAllUniqueCharacters("aba"));
    }
    @Test
    void stringHasAllUniqueCharacters(){
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.hasAllUniqueCharacters("abc"));
    }
}