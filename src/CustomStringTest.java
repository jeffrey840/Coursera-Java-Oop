//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class CustomStringTest {
//
//    //declare custom string for testing
//    CustomString myCustomString;
//
//    @BeforeEach
//    public void setUp() throws Exception {
//        //initialize custom string for testing
//        this.myCustomString = new CustomString();
//    }
//
//    @Test
//    void testGetString() {
//        //string should be null to start, before setting it
//        assertNull(this.myCustomString.getString());
//
//        this.myCustomString.setString("hello");
//        assertEquals("hello", this.myCustomString.getString());
//
//        // Test case 1: Empty string
//        this.myCustomString.setString("");
//        assertEquals("", this.myCustomString.getString());
//
//        // Test case 2: String with numbers
//        this.myCustomString.setString("abc123def");
//        assertEquals("abc123def", this.myCustomString.getString());
//
//        // Test case 3: String with special characters
//        this.myCustomString.setString("a!b@c#");
//        assertEquals("a!b@c#", this.myCustomString.getString());
//
//        // Test case 4: String with whitespace characters
//        this.myCustomString.setString(" hello   world ");
//        assertEquals(" hello   world ", this.myCustomString.getString());
//    }
//
//
//    @Test
//    void testSetString() {
//
//        //string should be null to start, before setting it
//        assertNull(this.myCustomString.getString());
//
//        this.myCustomString.setString("Good-bye!");
//        assertEquals("Good-bye!", this.myCustomString.getString());
//
//        // TODO write at least 3 additional test cases
//    }
//
//    @Test
//    void testRemove() {
//        assertEquals("", this.myCustomString.remove(""));
//
//        this.myCustomString.setString(null);
//        assertEquals("", this.myCustomString.remove(""));
//
//        this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
//        assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
//
//        // TODO write at least 3 additional test cases
//    }
//
//    @Test
//    void testReverse() {
//        assertEquals("", this.myCustomString.reverse(""));
//
//        this.myCustomString.setString(null);
//        assertEquals("", this.myCustomString.reverse(""));
//
//        this.myCustomString.setString("abc, XYZ; 123");
//        assertEquals("1zyx, cba; 321", this.myCustomString.reverse("bcdxyz@321"));
//
//        this.myCustomString.setString("racecar");
//        assertEquals("racecar", this.myCustomString.reverse("0123456789!@#$%^&*()_+-={}[]|\\:\";'<>?,./ "));
//
//        this.myCustomString.setString("apple");
//        assertEquals("elppa", this.myCustomString.reverse("pl"));
//
//        this.myCustomString.setString("Java is fun");
//        assertEquals("nuf si avaj", this.myCustomString.reverse("aei"));
//    }
//
//
//
//    @Test
//    void testFilterLetters() {
//        // Test case 1: current string is null
//        this.myCustomString.setString(null);
//        assertEquals("", this.myCustomString.filterLetters('E', false));
//
//        // Test case 2: given letter is not a letter
//        this.myCustomString.setString("abc");
//        assertEquals("", this.myCustomString.filterLetters('1', false));
//
//// Test case 3: remove letters less than or equal to given letter
//        this.myCustomString.setString("Hello 90, bye 2");
//        assertEquals("e 90, be 2", this.myCustomString.filterLetters('h', false));
//
//
//        // Test case 4: remove letters greater than or equal to given letter
//        this.myCustomString.setString("Abcdefg");
//        assertEquals("Ab", this.myCustomString.filterLetters('c', false));
//    }
//
//
//}