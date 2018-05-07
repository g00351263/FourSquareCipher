Authour Name 		: 	Raja Naseer Ahmed Khan.
Class	                :	B.Sc 2nd Year Software Development (Hons)
Project Assignment      :	Four Square Cipher for Data Structure and Algorithm.
Lecturer	        :	John Healey.
========================================================================================================================================
INSTRUCTIONS FOR USING FOUR SQUARE CIPHER
----------------------------------------------------------------------------------------------------------------------------------------
Zip includes Eclipse Project Folder along four-square-cipher.jar for running from commnad prompt and this Readme.txt.

A. On Running User Gets 3 Options. Type in and press enter
	1. Encrypt
		a. enter file name with extension i.e encrypted.txt to save file.
		b.select file to be encrypted. must be text file as reading the string in software.
	2.Decrypt.
		a. enter file name with extension i.e decrypted.txt to save file.
		b.select file to be encrypted. must be text file as reading the string in software.
	4.To Exit.

check the files to see weather they are encrypted or have errors. usually notepad is used but can be opened in wordpad if have error in notepad.

-----------------------------------------------------------------------------------------------------------------------------------------
PROGRAM STRUCTURE BY CLASSES DEFINED
=========================================================================================================================================
Runner     -> contains main method and Calling to Menu Class Object.
-------------------------------------------------------------------------------------------------------------------------
Menu       -> contains All Menu Enhancements as well while loop to controle the flow of Menu according to selections.
-------------------------------------------------------------------------------------------------------------------------
Parser     -> contains methods for Reading and Writing Files.(Note as provided by John Healey)
-------------------------------------------------------------------------------------------------------------------------
fileChoser -> contains the GUI menus to choose files to save after encrypt/decrypt vice versa for opening.(From Internet)
-------------------------------------------------------------------------------------------------------------------------
Key	   -> contains 2D Array with contains PlainAlphabets and Keywords(Note As Provided By John Healey).
-------------------------------------------------------------------------------------------------------------------------
Diagraph   -> contains Methods taking file as 1 intact String dividing its lengith by 2 if lengthi uneven it ads X in end, 
			String array is taking in substring with added another substring to pair Bigram and returning the,
			result to calling method or object.
-------------------------------------------------------------------------------------------------------------------------
Encryption -> looping through the matrix searching for alphabets if found it saves index as rows and columns, after searching,
	      		it uses index of searched alphabets to get index of encrypted key word as intersection of first and
			second word gives us encryption word at enc2 = wordArow and wordBcolumn, similarly enc2 = wordBrow and aCol.
			hence, this search can be done limiting the search with if statement and using index to get indexes,
			of plainText and keywordsText Squares.
-------------------------------------------------------------------------------------------------------------------------
Decryption -> As Above just the if statement is used to change indexes to get back word from encrypted text formula as,
			that dec1 = rowOfFirst + ColofSecond, dec2 = rowofSecond + ColofFirst.