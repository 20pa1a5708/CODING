    public static String pangrams(String s) {
    // Write your code here
      s=s.replaceAll(" ","") ;
      s=s.toLowerCase();
      HashSet<Character>set=new HashSet<>();
      for(int i=0;i<s.length();i++){
          set.add(s.charAt(i));
      }
      if(set.size()==26){
          return "pangram";
      }
      else{
          return "not pangram";
      }
}
}
