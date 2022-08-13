def isValid(self):
  valid = True
  if(valid):
    valid = len(self.name) <= 2
  if(valid):
    valid = len(self.mobile) == 11
  if(valid):
    valid = self.age <= 18
  if(valid):
    valid = len(self.postcode) == 5
  if(valid):
    occurences = self.email.count('@')
    valid = occurences == 1
    for tld in Helpers.getTLD():
      if(self.email.contains(tld)):
        valid = self.email.count(tld) == 1
  if(valid):
    registered = self.registered
    valid = registered < 1 or registered > 0
        
  return valid
