class Main inherits IO {
    x : Int <- 6;
    fact : Int;
    main() : Object {
        {
            out_int(fact(x));
            out_string("End");
        }
    };

    fact(x : Int) : Int {
        {
            fact <- 1;
            while(not(x = 0)) loop
            {
                fact <- fact * x;
                x <- x - 1;
            }
            pool;
            fact;
        }
    };
};