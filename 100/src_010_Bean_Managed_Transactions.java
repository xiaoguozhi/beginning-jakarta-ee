...
transa.begin();      // -- start the transaction
...
if(everythingOK) {
  transa.commit();   // -- commit the transaction
}else{
  transa.rollback(); // -- rollback the transaction
} 
...
