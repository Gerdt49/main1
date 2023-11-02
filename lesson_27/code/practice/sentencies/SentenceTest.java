package practice.sentencies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence;  // pole klassa tipa Sentence

    @BeforeEach
    void setUp() {

        sentence = new Sentence();  // vizvali pustoy konstruktor po umol4anij
    }

    @Test
    void countWordsTest() {
        String str = "One - two– three , four ";
        assertEquals(4,sentence.countWords(str));
    }

    @Test
    void countSymbolTest() {
        String str = "One? Two% Three$";
        assertEquals(16,sentence.countSymbols(str));
    }
}