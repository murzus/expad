package expad

import static org.junit.Assert.*
import org.junit.*

class PostIntegrationTestTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
        def user= new User(login:'admin',password:'mas').save()
	   // assertNotNull user.save()
		def sms1 = new SMS(phone:"79202005994",text:"comon test SMS")
		user.addToSmses(sms1)
		assertEquals 1, User.get(user.id).smses.size()
    }
}
