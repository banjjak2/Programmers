import java.util.*;

public class 위클리챌린지_4주차 {
    public static void main(String[] args) {
        // String[] table = {
        //     "SI JAVA JAVASCRIPT SQL PYTHON C#", 
        //     "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", 
        //     "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", 
        //     "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", 
        //     "GAME C++ C# JAVASCRIPT C JAVA"
        // };
        // String[] languages = {
        //     "PYTHON", 
        //     "C++", 
        //     "SQL"
        // };
        // int[] preference = {
        //     7, 5, 5
        // };

        String[] table = {
            "SI JAVA JAVASCRIPT SQL PYTHON C#", 
            "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", 
            "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", 
            "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", 
            "GAME C++ C# JAVASCRIPT C JAVA"
        };

        String[] languages = {
            "JAVA", 
            "JAVASCRIPT"
        };

        int[] preference = {
            7, 5
        };

        System.out.println(solution(table, languages, preference));
    }

    public static String solution(String[] table, String[] languages, int[] preference){
        String answer = "";
        Jobs jobs = new Jobs();
        HashMap<String, Integer> langAndPref = new HashMap<String, Integer>();
        jobs.setJob(table);

        for(int i=0; i<languages.length; i++){
            langAndPref.put(languages[i], preference[i]);
        }

        answer = jobs.getMaxScoreJobName(langAndPref);


        return answer;
    }

    public static class Jobs{
        private class Job{
            private String jobName;
            private HashMap<String, Integer> langScores = new HashMap<String, Integer>();

            private String getJobName(){
                return jobName;
            }

            private HashMap<String, Integer> getLangScores(){
                return langScores;
            }

            private void setJobName(String jobName){
                this.jobName = jobName;
            }

            private void setLangScores(String[] tables){
                for (int i=1; i<tables.length; i++){
                    langScores.put(tables[i], 6 - i);
                }
            }
        }

        private List<Job> jobsList = new ArrayList<Job>();
        public void setJob(String[] tables){
            String[] splits;
            Job job;
            for(int i=0; i<tables.length; i++){
                splits = tables[i].split(" ");

                job = new Job();
                job.setJobName(splits[0]);
                job.setLangScores(splits);
                jobsList.add(job);
            }
        }

        public int getJobCount(){
            return jobsList.size();
        }

        public HashMap<String, Integer> getLangScores(int index){
            int count = getJobCount();

            if (count == 0){
                return null;
            }

            return jobsList.get(index).getLangScores();
        }

        public String getMaxScoreJobName(HashMap<String, Integer> hm){
            int count = getJobCount();
            HashMap<String, Integer> jobScores;
            Job job = new Job();
            int max = 0;
            int tmpMax = 0;

            for(int i=0; i<count; i++){
                jobScores = jobsList.get(i).getLangScores();
                tmpMax = 0;
                
                for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                    tmpMax += (entry.getValue() * jobScores.getOrDefault(entry.getKey(), 0));
                }
                
                if (tmpMax > max){
                    max = tmpMax;
                    job = jobsList.get(i);
                }
                else if(tmpMax == max){
                    if(job.getJobName().compareTo(jobsList.get(i).getJobName()) > 0){
                        job = jobsList.get(i);
                    }
                }
            }

            return job.getJobName();
        }
    }
}
