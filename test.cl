

class A {

   var : Int <- 0;
   str : String <- "lol";
   value() : Int { var };

   set_var(num : Int) : SELF_TYPE {
      {
         num <- x * (2 + 4 - y / 8);
      }
   };

};