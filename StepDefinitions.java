public class StepDefinitions {

    /*Name Valid*/

    @Given("A name of {name} of n length")
    public void a_name_of_n_length(String name) {
        user.setName(name);
    }

    @When("The user submits the form")
    public void user_submit_details() {
        user.submit();
    }

    @Then("The name is more than 1 character")
    public void the_name_is_more_than_1_character() {
        Assert.assertTrue(user.getName().length() > 1);
        Assert.assertTrue(user.isValid());
    }

    /*Name Invalid*/

    @Given("A name of {name} of n length")
    public void a_name_of_n_length(String name) {
        user.setName(name);
    }

    @When("The user submits the form")
    public void user_submit_details() {
        user.submit();
    }

    @Then("The name is less than 1 character")
    public void the_name_is_less_than_1_character() {
        Assert.assertTrue(user.getName().length() < 1);
        assert.assertFalse(user.isValid());
    }

    /*Mobile Phone - Valid*/

    @Given("A mobile phone {number} of n length")
    public void a_mobile_phone_number_of_n_length(String number) {
        user.setPhone(number);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit();
    }

    @Then("The number is 11 characters")
    public void the_phone_number_is_11_characters() {
        Assert.assertEquals(11, user.getPhone().length())
        Assert.assertTrue(user.isValid());
    }

    /*Mobile Phone - Invalid*/

    @Given("A mobile phone {number} of n length")
    public void a_mobile_phone_number_of_n_length(String number) {
        user.setPhone(number);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit();
    }


    @Then("The number is not 11 characters")
    public void the_phone_number_is_11_characters() {
        Assert.assertFalse(user.getPhone().length() == 11);
        Assert.assertFalse(user.isValid());
    }

    /*Age - Valid*/

    @Given("A age of {int}")
    public void a_age(Integer age) {
        user.setAge(age);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit();
    }


    @Then("The age is greater than 17")
    public void the_age_is_greater_than_17() {
        Assert.assertTrue(user.getPhone() > 17);
        Assert.assertTrue(user.isValid());
    }
    
    /* Age - Invalid */
    
    @Given("A age of {int}")
    public void a_age(Integer age) {
        user.setAge(age);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit();
    }
    
    @Then("The age is greater is less than 18")
    public void the_age_is_less_than_18() {
        Assert.assertTrue(user.getPhone() < 18);
        Assert.assertFalse(user.isValid());
    }
    
    /* Email - Valid */
    
    @Given("A email")
    public void a_email(String Email) {
        user.setEmail(age);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit();
    }
    
    @Then("The email is more than 0 characters")
    public void the_email_is_not_a_non_zero_length() {
        Assert.assertTrue(user.getEmail().length() > 0);
    }
    
    @Then("The email contains 1 'at' character")
    public void the_email_has_one_at_character() {
        Assert.assertTrue(user.getEmail().contians("@"));
        Integer occurences = user.getEmail().chars().filter(x -> x == '@').count();
        Assert.assertEquals(1, occurences);
    }
    
    @Then("The email contains 1 valid TLD suffix")
    public void the_email_contains_a_valid_TLD_suffix() {
        ArrayList<String> Suffixes = Helper.getTLDSuffixes();
        String suffixOccurence = "";
        for(String suffix : suffixes) {
            if(user.getEmail().contains(suffix)) {
                if(suffixOccurence.equals("")) {
                    suffixOccurence = suffix;
                } else {
                    Assert.Fail("Multiple suffixes in email domain extension");
                }
            }
        }
        if(suffxOccurence.equals("") {
            Assert.Fail("Domain does not contains a valid suffix from the suffix list");   
        }
        Assert.assertTrue(user.isValid());
    }
           
    /* Email - Invalid */
    
    @Given("A email")
    public void a_email(String Email) {
        user.setEmail(age);
    }

    @When("The user submits the form")
    public void user_submits_details() {
        user.submit();
    }
    
    @Then("The email is less than 1 character")
    public void the_email_is_not_a_non_zero_length() {
        Assert.assertTrue(user.getEmail().length() < 1);
        Assert.assertFalse(user.isValid());
    }
    
    @Then("The email contains more than 1 'at' character")
    public void the_email_has_one_at_character() {
        Assert.assertTrue(user.getEmail().contians("@"));
        Integer occurences = user.getEmail().chars().filter(x -> x == '@').count();
        Assert.assertTrue(occurences > 1);
        Assert.assertFalse(user.isValid());
    }
    
    @Then("The email contains 1 invalid TLD suffix")
    public void the_email_contains_a_valid_TLD_suffix() {
        ArrayList<String> Suffixes = Helper.getTLDSuffixes();
        String suffixOccurence = "";
        for(String suffix : suffixes) {
            if(user.getEmail().contains(suffix)) {
                if(suffixOccurence.equals("")) {
                    suffixOccurence = suffix;
                } else {
                    Assert.Fail("Multiple suffixes in email domain extension");
                }
            }
        }
        if(suffxOccurence.equals("") {
            Assert.Fail("Domain does not contains a valid suffix from the suffix list");   
        }
        Assert.assertFalse(user.isValid());
    }
           
    /*Registered - Valid*/

    @Given("A {value} of previously registered")
    public void a_registered_value(Integer value) {
        user.setRegistered(value);
    }

    @When("The user submits the form")
    public void user_submit_details() {
        user.submit();
    }

    @Then("The user has a valid registration value")
    public void the_value_is_valid() {
        Assert.assertTrue(user.getRegistered() < 1 && user.getRegistered() > 0);
        Assert.assertTrue(user.isValid());
    }
           
    /*Registered - Invalid*/

    @Given("A {value} of previously registered")
    public void a_registered_value(Integer value) {
        user.setRegistered(value);
    }

    @When("The user submits the form")
    public void user_submit_details() {
        user.submit();
    }

    @Then("The user has a invalid registration value")
    public void the_value_is_valid() {
        Assert.assertTrue(user.getRegistered() > 1 || user.getRegistered() < 0);
        Assert.assertFalse(user.isValid());
    }

}




