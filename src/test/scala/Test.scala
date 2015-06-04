/**
 * Created by Yu on 15-05-21.
 */

import org.specs2.mutable._

class Test extends Specification {

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
  }

  "Simple test" {
    "is numeric" in {
      "Hello world" must have size(11)
    }
  }
}