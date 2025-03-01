p u bli c s t a t i c i n t getAbsAdd ( i n t x , i n t y ) {
a s s e r t x != I n t e g e r .MIN VALUE;
a s s e r t y != I n t e g e r .MIN VALUE;
i n t absX = Math . abs ( x ) ;
i n t absY = Math . abs ( y ) ;
a s s e r t ( absX <= I n t e g e r .MAX VALUE − absY ) ;
r e t u r n absX + absY ;
}
// Usage : getAbsAdd ( I n t e g e r .MIN VALUE, 1 ) ;
