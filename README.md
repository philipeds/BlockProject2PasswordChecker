Program Purpose:
The purpose of this program is to be a very basic password strenghth checker. Written in Java, it runs in the user's terminal. Once given a password, the program will 
return a "password score" the user can interpret to understand how strong their password is.

How to run the program:
To run the program, clone the repository to your computer via this url "https://github.com/philipeds/BlockProject2PasswordChecker". Once cloned, run the program through 
your favorite IDE or through the terminal.

Warnings:
This tool is for educational use only and should not be used for securing sensitive information. This program is just a fun demonstration of ethical security concerns and
is designed to give the user an opinion on their password strength. This project is licensed under the MIT license. This program provides no warranty of any kind. Use at 
your own risk.

Ethical Concerns:
This is a very basic tool. The score given is based on a few criteria, such that commons passwords such as "password12345" may receive a high score. A password such as
"!tYf9&%AL1" may seem more complicated, but return an equal or lower password score to the user. This program may tell a user that a highly vulnerable (common) password
is just as strong as the latter example. The given score is not always a true reflection of the password's complexity/strength. 

AI tools used for development

1) ChatGPT
   - Aided in generating Regex expressions used in the program to evaluate the password.
   - Specifically:
     "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]" for special characters
     ".*[a-z].*"                                  for lowercase letters
     ".*[A-Z].*"                                  for uppercase letters
     ".*\\d.*"                                    for digits
     
