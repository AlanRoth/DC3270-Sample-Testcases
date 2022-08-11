public class StepDefinitions {

    /*Name Valid*/

    @Given("A name of {name} of n length")
    public void a_name_of_n_length(String name) {
        user.setName(name);
    }

    @When("The user submits the form")
    public void user_submit_details() {
        user.submit()
    }

    @Then("The name is more than 1 character")
    public void the_name_is_more_than_1_character() {
        Assert.assertTrue(user.getName().length() > 1);
        Assert.assertTrue(user.isValid())
    }

    /*Name Invalid*/

    @Given("A name of {name} of n length")
    public void a_name_of_n_length(String name) {
        user.setName(name);
    }

    @When("The user submits the form")
    public void user_submit_details() {
        user.submit()
    }

    @Then("The name is less than 1 character")
    public void the_name_is_less_than_1_character() {
        Assert.assertTrue(user.getName().length() < 1)
        assert.assertFalse(user.isValid())
    }

    /*Mobile Phone - Valid*/

    @Given("A mobile phone {number} of n length")
    public void a_mobile_phone_number_of_n_length(String number) {
        user.setPhone(number);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit()
    }

    @Then("The number is 11 characters")
    public void the_phone_number_is_11_characters() {
        Assert.assertEquals(11, user.getPhone().length())
        Assert.assertTrue(user.isValid())
    }

    /*Mobile Phone - Invalid*/

    @Given("A mobile phone {number} of n length")
    public void a_mobile_phone_number_of_n_length(String number) {
        user.setPhone(number);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit()
    }


    @Then("The number is not 11 characters")
    public void the_phone_number_is_11_characters() {
        Assert.assertFalse(user.getPhone().length() == 11)
        Assert.assertFalse(user.isValid())
    }

    /*Age*/



}




