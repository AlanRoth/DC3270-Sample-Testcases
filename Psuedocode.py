class User():

    def __init__(name, mobile, age, postcode, email):
        self.name = name
        self.mobile = mobile
        self.age = age
        self.postcode = postcode
        self.email = email

    def isValid():
        valid = False
        if(self.name):
            valid = len(self.name) <= 2
        if(self.mobile):
            valid = len(self.mobile) == 11
        if(self.age):
            valid = self.age <= 18
        if(self.postcode):
            valid = len(self.postcode) == 5
        if(self.email):
            occurences = email.count('@')
            valid = occurences == 1
            for tld in Helpers.getTLD():
                if(email.contains(tld)):
                    valid = email.count(tld) == 1
        if(self.registered):
            registered = self.registered
            valid = registered < 1 or registered > 0
        
        return valid

def register_user(name, mobile, age, postcode, email, registered):
    user = new User(name, mobile, age, postcode, email, registered)
    if(user.isValid()) {
        user.submit()
    }



