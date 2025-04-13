class peddhadevara
{
void dhairyam()
{
System.out.println("Yerra samudhram yegisi padala");
}
}
class pilladevara extends peddhadevara
{
void pirikithanam()
{
System.out.println("Ayyo naaku bayam");
}
}
class fun
{
public static void main(String[] args)
{
pilladevara p=new pilladevara();
p.dhairyam();
}
}