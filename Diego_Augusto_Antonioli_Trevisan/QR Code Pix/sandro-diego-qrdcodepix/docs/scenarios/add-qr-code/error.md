# scenario: errors case invalid pix key

**when:** the user provide an invalid pix key

**returns:** throws an InvalisParamError

# scenario: errors case invalid amount

**when:** the user provide an invalid amount

**returns:** throws an InvalisParamError

# scenario: error case Celcoin out of air

**when:** Celcoin is out of air 

**returns:** throws a CelcoinOutOfRangeError

# scenario: error case the Database is out of air

**when:** the database is out of air

**returns:** throws a DatabaseOutOfRangeError