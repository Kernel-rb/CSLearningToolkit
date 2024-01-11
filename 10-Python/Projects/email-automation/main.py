# import the smtplib module
# smtplib is used to create an SMTP (Simple Mail Transfer Protocol) object that can be used to send an email
import smtplib


def send() : 
    # Connect to the server
    server = smtplib.SMTP('smtp.gmail.com', 587)
   
    server.starttls() 
    # Login to the server
    server.login("gmail", "password")
    # Send the email
    server.sendmail("sender", "receiver", "message")
    # Close the connection
    server.close()

