	
	
	/* This class is meant to be used so that the user can double click the jar file,
	 * and a new terminal window will open, just thought that this might be a cool idea to add on
	 */
	 
	 /*PROBLEMS SO FAR: 
	  *	After Terminal is opened, it needs to execute the Console.java file
	  * and user input must be taken in a different way 
	  * then command line args.  (Maybe a Scanner(system.in) ?)
	  *  
	  */
	 
	public class NewWindow {
	//Retrieves os information
		String nameOS = System.getProperty("os.name").toLowerCase();;        
        String versionOS = "os.version";        
        String architectureOS = "os.arch";
        //Path to execute terminal or cmd
        String executePath=null;
        //Unix based systems can only access stuff in their home/users directory
		String userName=null;
    public static final int WINDOWS=1;
    public static final int MAC=2;
    public static final int UNIX=3;
        
        
        public static void main(String[] args) {
            openTerminal(findTerminal);
            //perhaps make a call to Console.java? IDK
        }
    
   
   //executes terminal, terminal window should pop up
   public int openTerminal(int x) {
	   if(x==WINDOWS) {
		   Runtime.getRuntime.exec(executePath);
		   return WINDOWS;}
		   else if(x==MAC) {
			   Runtime.getRuntime.exec(executePath);
			   return MAC; }
			   else if(x==UNIX) {
				   Runtime.getRuntime.exec(executePath);
				   return UNIX;  }
				   else return -1;
   
   
   
   
   
   
   //Changes the filepath to terminal based off os type
     public int findTerminal() {
		 if(isWindows()) {
			 excutePath="c:\\Windows\\System32\\cmd";
			 return WINDOWS;
		 else if(isMac()) {
			 executePath="/Applications/Terminal.app";
			 return MAC;
		else if(isUnix()) {
			executePath="/usr/share/applications/Terminal"
			return UNIX;
			else return -1;
     
     
     
      /*Find what os type it is */
        
		public static boolean isWindows() {
 
		return (nameOS.indexOf("win") >= 0);
 
	}
 
	public static boolean isMac() {
 
		return (nameOS.indexOf("mac") >= 0);
		
 
	}
 
	public static boolean isUnix() {
 
		return (nameOS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 || "ntu" > 0);
		userName=System.getProperty("user.name");
	}
 
