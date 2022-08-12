class User():

    def __init__(self, name, mobile, age, postcode, email):
        self.name = name
        self.mobile = mobile
        self.age = age
        self.postcode = postcode
        self.email = email

    def isValid(self):
        valid = True
        if(self.name and valid):
            valid = len(self.name) <= 2
        if(self.mobile and valid):
            valid = len(self.mobile) == 11
        if(self.age and valid):
            valid = self.age <= 18
        if(self.postcode and valid):
            valid = len(self.postcode) == 5
        if(self.email and valid):
            occurences = self.email.count('@')
            valid = occurences == 1
            for tld in Helpers.getTLD():
                if(self.email.contains(tld)):
                    valid = self.email.count(tld) == 1
        if(self.registered and valid):
            registered = self.registered
            valid = registered < 1 or registered > 0
        
        return valid

def register_user(name, mobile, age, postcode, email, registered):
    user = User(name, mobile, age, postcode, email, registered)
    if(user.isValid()):
        user.submit()
