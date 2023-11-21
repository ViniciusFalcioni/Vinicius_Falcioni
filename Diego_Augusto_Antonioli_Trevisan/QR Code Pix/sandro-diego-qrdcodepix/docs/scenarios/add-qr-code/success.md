# scenario: success case 

when: the user provide valid amount 

and: the user provide valid pix key

then: calls the merchant's informations

then: calls qr code provider 

then: store qr code in database

then: convert qr code to base64

returns: base64 and the amount