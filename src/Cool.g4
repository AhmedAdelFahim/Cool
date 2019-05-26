grammar Cool;
import CommonLexerCool;


program : cls+  ;

cls : CLASS ID (INHERITS ID)? LBRACE (stmt SEMI)* RBRACE SEMI;

stmt : ID LPAREN (param (COMMA param)*)? RPAREN COLON ID LBRACE st RBRACE          	# functionDeclare
     | ID COLON ID (LARROW expr)?                                                    # varialeDeclare
     ;
param : ID COLON ID;

st  : ID LARROW expr                                                                 # assignment
    | expr                                                                           # exprition
    ;

expr
    : LBRACE (st SEMI)+ RBRACE                                                       # block
    | INTEGER                                                                        # integer
    | LPAREN expr RPAREN                                                             # parantesies
    | expr MUL expr                                                                  # mul
    | expr DIVIDE expr                                                               # div
    | expr PLUS expr                                                                 # add
    | expr MINUS expr                                                                # sub
    | NEGATE expr                                                                    # negate
    | expr LT expr                                                                   # lessThan
    | expr LE expr                                                                   # lessThanOrEqual
    | expr EQUALS expr                                                               # equals
    | NOT expr                                                                       # not
    | NEW ID                                                                         # object
    | TRUE                                                                           # true
    | IF expr THEN expr ELSE expr FI                                                 # if
    | WHILE expr LOOP expr POOL                                                      # while
    | LET ID COLON ID (LARROW expr)? (COMMA ID COLON ID (LARROW expr)?)* IN expr     # blockLet
    | expr(AT ID)? DOT ID LPAREN (expr (COMMA expr)*)? RPAREN                        # classCallFunction
    | ID LPAREN (expr (COMMA expr)*)? RPAREN                                         # callFunction
    | CASE expr OF (ID COLON ID RARROW expr SEMI)+ ESAC                              # case
    | ISVOID expr                                                                    # isvoid
    | ID                                                                             # identifier
    | STRING                                                                         # string
    | FALSE                                                                          # false
    ;

