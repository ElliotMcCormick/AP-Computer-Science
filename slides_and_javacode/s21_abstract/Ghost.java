package s21_abstract;

// A+ Computer Science
// www.apluscompsci.com

//abstract example three 

class Ghost extends Monster
{
  public Ghost( String name )
  {
    super(name);
  }

  public String talk()
  {
     return "\"Where did I go?\"\n\n";
  }
}
