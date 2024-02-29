class Wiggler {
  private int myX, myY;
  public Wiggler()
  {
    myX = 150;
    myY = 150;
  }
  public void wiggle()
  {
    myX+=(int)(Math.random()*5)-2;
  }
  int getmyX() {
    return myX;
  }
  int getmyY() {
    return myY;
  }
  void setmyX(int _myX) {
    myX = _myX;
  }
  void setmyY(int _myY) {
    myY = _myY;
  }
}
