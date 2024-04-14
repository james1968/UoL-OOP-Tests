import java.util.ArrayList;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) {
                //System.out.println(Classify.classify('c'));
                //System.out.println(Classify.classify('D'));
                //System.out.println(Classify.classify('i'));
                //System.out.println(Classify.classify('O'));
                //System.out.println(Classify.classify('8'));
                //System.out.println(Classify.classify('<'));
                //System.out.println(Separate.separate("hello"));
                //System.out.println(Between.between(3, 7));
                //System.out.println(Anagrams.anagrams("The Shining", "Highest inn"));
                //System.out.println(Anagrams.anagrams("penny", "penn"));
                //System.out.println(Roman.convert(7));
                //System.out.println(Roman.convert(3490));
                //BankAccount c = new BankAccount( -10 );
                //c.updateBalance( 20 );
                //c.updateBalance( 5 );
                //System.out.println("Min: " + c.getMin() + ", Max: " + c.getMax());

                //Dates a = new Dates( 30, 11 );
                /*System.out.println( a );
                a.addDays( 1 );
                System.out.println( a );
                a.addDays( 30 );
                System.out.println( a );
                a.addDays( 5 );
                System.out.println( a );

                Dates b = new Dates( 01, 32 );
                System.out.println( a );
                b.addDays( 32 );
                System.out.println( b );
                b.addDays( 32 );
                System.out.println( b );
                b.addDays( 32);
                System.out.println( b );*/

                /*ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
                list.add(1);
                Triplicate.triplicate(list);*/

                /*CenteredNumber c = new CenteredNumber("");
                System.out.println(c.centeredNumber);
                CenteredNumber d = new CenteredNumber("zzz");
                System.out.println(d.centeredNumber);*/

                /*Rectangle r = new Rectangle(1, 1,3,7);
                System.out.println(r.toString());
                r.containsPoint(2,3);
                r.containsPoint(4,8);
                r.containsPoint(6,3);
                r.containsRectangle(new Rectangle(2, 2, 1,  1));

                Rectangle r1 = new Rectangle(6, 7);
                System.out.println(r1.toString());
                r1.containsPoint(2,3);
                r1.containsPoint(4,8);
                r1.containsPoint(6,3);
                r1.containsRectangle(new Rectangle(2, 2));*/

               /* String s = "";
                Rectangle r2 = new Rectangle( 100, 100, 3, 4 );
                for( int j = 102; j <= 104; j++ )
                {
                        for( int k = 103; k <= 105; k++ )
                        {
                                s = s + r2.containsPoint( j, k ) + " | ";
                        }
                }
                System.out.println("true | true | false | true | true | false | false | false | false |");

                }*/

                /*Square s1 = new Square(100, 100, 5);
                System.out.println(s1.toString());

                String s = "";
                String snippet = "";

                String[] t = { "true | false | (-1,-1), (9,9) | (0,0), (9,9) | " };

                for( int i = 0; i < 1; i++ )
                {
                        if( i == 0 ) {
                                {
                                        s = "";
                                        Square r = new Square( -1, -1, 10 );
                                        Square r2 = new Square( 9 );
                                        s = s + r.containsRectangle( r2 ) + " | ";
                                        s = s + r2.containsRectangle( r ) + " | ";
                                        s = s + r.toString() + " | ";
                                        s = s + r2.toString() + " | ";
                                }
                                snippet = "{\n	s = \"\";\n	Square r = new Square( -1, -1, 10 );\n	Square r2 = new Square( 9 );\n	s = s + r.containsRectangle( r2 ) + \" | \";\n	s = s + r2.containsRectangle( r ) + \" | \";\n	s = s + r.toString() + \" | \";\n	s = s + r2.toString() + \" | \";\n}";
                        }


                        if( !s.equals( t[i]))
                        {
                                System.out.println( "---- On code snippet:" );
                                System.out.println( snippet );
                                System.out.println( "---- Expected value of String s:" );
                                System.out.println( t[i] );
                                System.out.println( "---- Actual value of String s:" );
                                System.out.println( s );
                                return;
                        }
                }
                System.out.println( "Passed all tests." );*/

                /*Chess.ChessPiece a = new Chess.King( 1, 1 );
                Chess.ChessPiece b = new Chess.Queen( 2, 2 );
                Chess.ChessPiece c = new Chess.Queen( 1, 2 );
                Chess.ChessPiece d = new Chess.Queen( 2, 1 );
                Chess.ChessPiece e = new Chess.Queen( 4, 4 );

                Chess.ChessPiece f = new Chess.Bishop( 3, 4);
                Chess.ChessPiece g = new Chess.Queen(5, 6);
                Chess.ChessPiece h = new Chess.Queen(3, 5);

                System.out.println(a.canAttack( b ));
                System.out.println(a.canAttack( c ));
                System.out.println(a.canAttack( d ));
                System.out.println(a.canAttack( e ));
                System.out.println(f.canAttack( g ));
                System.out.println(f.canAttack( h ));*/
                /*Chess.ChessPiece a = new Chess.King( 0, 0 );
                Chess.ChessPiece b = new Chess.Queen( 2, 2 );
                System.out.println(a.canAttack( b ));
                Chess.ChessPiece c = new Chess.Bishop( 0, 0 );
                Chess.ChessPiece d = new Chess.Rook( 2, 2 );
                System.out.println(c.canAttack( d ));
                Chess.ChessPiece e = new Chess.Rook( 2, 2 );
                Chess.ChessPiece f = new Chess.Knight( 2, 5 );
                Chess.ChessPiece g = new Chess.Rook( 7, 2 );
                System.out.println(e.canAttack( g ));
                System.out.println(b.canAttack( g ));
                System.out.println(f.canAttack(g));*/
                Vector v = new Vector(4, 9);
                System.out.println(v.getX());
                System.out.println(v.getY());
                System.out.print(v.toString());

                /*int numberToCheck = 6;

                switch(numberToCheck) {
                        case 1:
                                System.out.println("The number is one");
                        case 2:
                                System.out.println("The number is two");
                        case 3:
                                System.out.println("The number is three");
                        case 4:
                                System.out.println("The number is four");
                        case 5:
                                System.out.println("The number is five");
                        case 6:
                                System.out.println("The number is six");
                        case 7:
                                System.out.println("The number is seven");
                        case 8:
                                System.out.println("The number is eight");
                        case 9:
                                System.out.println("The number is nine");
                        default:
                                System.out.println("Default Case");
                }

                System.out.println("Outside the switch");*/
        }

        }