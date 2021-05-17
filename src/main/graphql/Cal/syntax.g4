lexer grammar syntax;

NEWLINE: '\r'?'\n';
INT: [0-9]+;
ID: [a-zA-Z]+;
WS: [\t]+ ->skip;
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';