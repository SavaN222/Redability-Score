# Learning outcomes
### Learn to call programs from the command-line and get more experience with using regexes and Math class.

In this stage, you will program the Automated readability index. It was introduced in 1968 and a lot of research works rely on this. The index is calculated by the following formula:

score = 4.71 \times \dfrac{characters}{words} + 0.5 \times \dfrac{words}{sentences} - 21.43score=4.71× 
words
characters
​	
 +0.5× 
sentences
words
​	
 −21.43

You can look at different ages corresponding to the different scores by the table in this article.

Also, your program should read a file instead of typing a text manually. You should pass the filename through the command line arguments.

The program should output the score itself and an approximate age needed to comprehend the text.

Use the appropriate rounding function to calculate the score as integer.

You should also print how many characters, words, and sentences the text has.

The number of characters is any visible symbol (so, in the real text it's everything except space, newline "\n" and tab "\t").

Notice, that the text can contain multiple lines, not just a single line like in the previous stages. You should analyze all the lines.
