//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class WordCounterTest {
//
//    MyFileReader fr1;
//    MyFileReader fr2;
//
//    @BeforeEach
//    void setUp() throws Exception {
//
//        // original war_and_peace.txt file
//        fr1 = new MyFileReader("war_and_peace.txt");
//
//        // test file containing some text from war_and_peace.txt, with different characters and info
//        fr2 = new MyFileReader("test1.txt");
//    }
//
//    @Test
//    void testWordCounter() {
//
//        // Get clean lines from test1.txt
//        ArrayList<String> linesSol = fr2.getCleanContent();
//
//        // Create new Word Counter
//        WordCounter wc = new WordCounter(linesSol);
//
//        // Get map of words and counts
//        Map<String, Integer> counters = wc.getWordCounter();
//
//        // Assert 1: Test the count of different words in map
//        assertEquals(1, (int) counters.get("Gutenberg"));
//
//        // Assert 2: Test the count of different words in map
//        assertEquals(3, (int) counters.get("and"));
//
//        // Get clean lines from war_and_peace.txt
//        linesSol = fr1.getCleanContent();
//
//        // Create new Word Counter
//        wc = new WordCounter(linesSol);
//
//        // Get map of words and counts
//        counters = wc.getWordCounter();
//
//        // Assert 3: Test the count of different words in map
//        int atCount = counters.get("at");
//        System.out.println("atCount: " + atCount);
//        assertTrue(atCount >= 3700 & atCount <= 4700);
//
//        // Assert 4: Test the count of different words in map
//        int inCount = counters.get("in");
//        System.out.println("inCount: " + inCount);
//        assertTrue(inCount >= 7700 & inCount <= 8700);
//
//        // Assert 5: Test the count of different words in map
//        assertEquals((int) counters.getOrDefault("adasdada", 0), 0);
//
//        // Assert 6: Test the count of different words in map
//        assertEquals((int) counters.getOrDefault(" ", 0), 0);
//
//        // Assert 7: Test the count of different words in map
//        assertEquals(8, (int) counters.get("renounce"));
//
//        // Assert 8: Test the count of different words in map
//        assertEquals(5, (int) counters.get("similarly"));
//
//        // Assert 9: Test the count of different words in map
//        assertEquals(712, (int) counters.get("we"));
//    }
//
//    // ============================
//
//
//
//
//
//
//
//    @Test
//    void testGetWordsOccuringMoreThan() {
//
//        // Create new FileReader
//        MyFileReader fr = new MyFileReader("war_and_peace.txt");
//
//        // Get clean lines from the File
//        ArrayList<String> linesSol = fr.getCleanContent();
//
//        // Create new Word Counter
//        WordCounter wc = new WordCounter(linesSol);
//
//        // Get words occurring more than 0 times
//        ArrayList<String> ls1 = wc.getWordsOccuringMoreThan(0);
//        System.out.println("ls1: " + ls1.size());
//        assertTrue(ls1.size() >= 41400 & ls1.size() <= 42400);
//
//        // Get words occurring more than 1000 times
//        ArrayList<String> ls2 = wc.getWordsOccuringMoreThan(1000);
//        System.out.println("ls2: " + ls2.size());
//        assertTrue(ls2.size() >= 50 & ls2.size() <= 60);
//
//        // Get words occurring more than 10000 times
//        ArrayList<String> ls3 = wc.getWordsOccuringMoreThan(10000);
//        System.out.println("ls3: " + ls3.size());
//        assertTrue(ls3.size() >= 4 & ls3.size() <= 6);
//        assertEquals(ls3.get(0), "a");
//        assertEquals(ls3.get(1), "of");
//
//        // Additional test case 1
//        ArrayList<String> lines2 = new ArrayList<String>();
//        lines2.add("[T]his is a test.");
//        lines2.add("[T]his is another test.");
//        lines2.add("[T]his is yet another test.");
//
//        WordCounter wc2 = new WordCounter(lines2);
//
//        ArrayList<String> ls4 = wc2.getWordsOccuringMoreThan(1);
//        assertEquals(ls4.size(), 6);
//        assertEquals(ls4.get(0), "a");
//        assertEquals(ls4.get(1), "another");
//        assertEquals(ls4.get(2), "yet");
//        assertEquals(ls4.get(3), "[T]his");
//
//        // Additional test case 2
//        ArrayList<String> lines3 = new ArrayList<String>();
//        lines3.add("apple");
//        lines3.add("banana banana");
//        lines3.add("cherry cherry cherry");
//        lines3.add("daisy daisy daisy daisy");
//
//        WordCounter wc3 = new WordCounter(lines3);
//
//        ArrayList<String> ls5 = wc3.getWordsOccuringMoreThan(2);
//        assertEquals(ls5.size(), 3);
//        assertEquals(ls5.get(0), "banana");
//        assertEquals(ls5.get(1), "cherry");
//
//        // Additional test case 3
//        ArrayList<String> lines4 = new ArrayList<String>();
//        lines4.add("Cat");
//        lines4.add("Dog");
//        lines4.add("Cat");
//        lines4.add("cat");
//        lines4.add("DOG");
//
//        WordCounter wc4 = new WordCounter(lines4);
//
//        ArrayList<String> ls6 = wc4.getWordsOccuringMoreThan(1);
//        assertEquals(ls6.size(), 4);
//        assertEquals(ls6.get(0), "Cat");
//        assertEquals(ls6.get(1), "cat");
//    }
//
//
//
//// ==========================
//
//
//
//
//
//
//    @Test
//    void testGenerateWordCounts() {
//        // lines to count words
//        ArrayList<String> lines = new ArrayList<String>();
//        lines.add("war and the");
//        lines.add("war the peace peace");
//        lines.add("the war the");
//
//        Map<String, Integer> expectedCounts = new HashMap<String, Integer>();
//        expectedCounts.put("war", 3);
//        expectedCounts.put("and", 1);
//        expectedCounts.put("the", 4);
//        expectedCounts.put("peace", 2);
//
//        // Create new Word Counter
//        WordCounter wc = new WordCounter(lines);
//
//        // Get and test map of words and counts
//        assertEquals(expectedCounts, wc.getWordCounter());
//
//        // Additional test case 1
//        ArrayList<String> lines2 = new ArrayList<String>();
//        lines2.add("The quick brown fox jumps over the lazy dog");
//        lines2.add("The quick brown fox jumps over the lazy dog");
//
//        Map<String, Integer> expectedCounts2 = new HashMap<String, Integer>();
//        expectedCounts2.put("The", 2);
//        expectedCounts2.put("quick", 2);
//        expectedCounts2.put("brown", 2);
//        expectedCounts2.put("fox", 2);
//        expectedCounts2.put("jumps", 2);
//        expectedCounts2.put("over", 2);
//        expectedCounts2.put("the", 2);
//        expectedCounts2.put("lazy", 2);
//        expectedCounts2.put("dog", 2);
//
//        WordCounter wc2 = new WordCounter(lines2);
//
//        assertEquals(expectedCounts2, wc2.getWordCounter());
//
//        // Additional test case 2
//        ArrayList<String> lines3 = new ArrayList<String>();
//        lines3.add("apple apple apple");
//        lines3.add("banana");
//        lines3.add("cherry cherry");
//        lines3.add("apple");
//
//        Map<String, Integer> expectedCounts3 = new HashMap<String, Integer>();
//        expectedCounts3.put("apple", 4);
//        expectedCounts3.put("banana", 1);
//        expectedCounts3.put("cherry", 2);
//
//        WordCounter wc3 = new WordCounter(lines3);
//
//        assertEquals(expectedCounts3, wc3.getWordCounter());
//
//        // Additional test case 3
//        ArrayList<String> lines4 = new ArrayList<String>();
//        lines4.add("cat dog");
//        lines4.add("cat");
//        lines4.add("cat");
//        lines4.add("dog dog dog");
//
//        Map<String, Integer> expectedCounts4 = new HashMap<String, Integer>();
//        expectedCounts4.put("cat", 3);
//        expectedCounts4.put("dog", 4);
//
//        WordCounter wc4 = new WordCounter(lines4);
//
//        assertEquals(expectedCounts4, wc4.getWordCounter());
//    }
//
//
//}