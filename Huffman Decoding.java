void decode(String s, Node root) {
        Node temp=root;
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
            if(temp.left==null&&temp.right==null){
                result+=(temp.data);
                temp=root;
            }
        }
System.out.println(result);
       
    }
