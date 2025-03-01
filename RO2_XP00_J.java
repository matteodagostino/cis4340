p u bli c void d e l e t e F i l e ( ) {
F i l e someFile = new F i l e (” someFileName . t x t ” ) ;
// Do something with someFile
someFile . d e l e t e ( ) ;
}
Correct the code as shown in theCompliant Solution below:
p u bli c void d e l e t e F i l e ( ) {
F i l e someFile = new F i l e (” someFileName . t x t ” ) ;
// Do something with someFile
i f ( ! someFile . d e l e t e ( ) ) {
// Handle f a i l u r e to d e l e t e the f i l e
}
}
