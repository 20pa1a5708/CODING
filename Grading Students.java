List<Integer>result=new ArrayList<>();
        for(int i=0;i<grade.size();i++){
            if(grade.get(i)<38)
            {
 result.add(grade.get(i));
            }
            else if(grade.get(i)%5<=2){
        result.add(grade.get(i));
            }
            else{
                result.add(grade.get(i)+5-grade.get(i)%5);
            }
        }
        return result;
    }

}
