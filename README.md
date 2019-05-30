# Cool-Compiler
  Create compiler for cool programming language

# Group 5:
  - ghada ahmed

  - aml mohammed

  -  elham hesham

  - elhussein salah

  - ahmed adel
  
# introduction :-
  - The input -which is a cool program- is converted to the output -which is a three adress code- within three phases
  - to run this project run the main function then you could choose the phase  you want by entring its number
  
  ![run](https://user-images.githubusercontent.com/30018823/58605774-40c88100-8299-11e9-82bd-eb445534f4b3.png)

# Phase 1 -> genarate token :
  - First , we write a grammer that read tokens
  
  ![to](https://user-images.githubusercontent.com/30018823/58603307-8f255200-8290-11e9-81f6-ee7f1cc49f15.png)
  - Second , we send the cool program to the function _**getTokens**_ 
  
  ![codeto](https://user-images.githubusercontent.com/30018823/58603497-44f0a080-8291-11e9-8e0c-1576a582ba7c.png)
  - that outputs a set of tokens for the cool program
  
  ![outtok](https://user-images.githubusercontent.com/30018823/58603700-f8f22b80-8291-11e9-8304-4844f900ea29.png)
# Phase 2 -> parse tree :
  - After writing the grammer , a parse tree is constructed for the cool program according to it 
  
  ![par](https://user-images.githubusercontent.com/30018823/58604065-59ce3380-8293-11e9-884a-961f8630015d.png)
  
  - We run the grammer  with a right click on the mouse that is next to the starting symbol then we choose _**test rule**_ 
 
  ![pa](https://user-images.githubusercontent.com/30018823/58604445-a8c89880-8294-11e9-8968-0a7f7b3d075d.png)

  - output of parse tree
  ![outpar](https://user-images.githubusercontent.com/30018823/58604076-5c308d80-8293-11e9-8a5c-a97f981a7235.png)

# Phase 3 -> generate three address code :
  - After having the tokens and the parse tree   _**genThreeAddressCode**_
  
  ![thr](https://user-images.githubusercontent.com/30018823/58604722-b599bc00-8295-11e9-941f-d12bfbd5cf79.png)
  
  - first visits the root of that tree then keeps on visiting its children and generating a three adress code for each one until it reaches null 
  
  ![three](https://user-images.githubusercontent.com/30018823/58604954-82a3f800-8296-11e9-85bb-446c77aa6467.png)

  
  - And finally the generated three address code would be like
  
  ![outthre](https://user-images.githubusercontent.com/30018823/58604724-b599bc00-8295-11e9-8382-dce6b7154245.png)
  
  
# Along the three phases there's two extra codes :- 
  -  first ,  _**checkProgramState**_ which checks the test-program state wether it's good or bad
  
  ![ex](https://user-images.githubusercontent.com/30018823/58605170-32796580-8297-11e9-99e1-97c13488059b.png)

  - Second ,   _**ErrorReport**_ that checks if there's an error in the tested-cool program
  
  ![error](https://user-images.githubusercontent.com/30018823/58605400-e8dd4a80-8297-11e9-8431-0901051ee2e6.png)

  
  
  
  

