package oopsconcept;

public class Player {
		    
		    private int virat_odi_runs;
		    private int virat_t20_runs;
		    private int virat_test_runs;
		    private int virat_all_runs;
		    
		    Player()
		    {
		      virat_all_runs = 25218;
		    }
		    
		    Player(int test_runs, int odi_runs, int t20_runs)
		    {
		          this();
		          this.virat_test_runs = test_runs;
		          this.virat_odi_runs = odi_runs;
		          this.virat_t20_runs = t20_runs;
		    }
		    
		    Player(int test_runs,int odi_runs)
		        {
		          this();
		          this.virat_test_runs = test_runs;
		          this.virat_odi_runs = odi_runs;
		        }
		        
		   Player(int t20_runs)
		            {
		              this(1000,12000); // two argument pass
		              this.virat_t20_runs =t20_runs;
		              
		            }
		            
		            public void display()
		            {
		              System.out.println(this.virat_all_runs + " " + this.virat_odi_runs + " " + this.virat_t20_runs + " " + this.virat_test_runs);
		            }
		  
		  }



