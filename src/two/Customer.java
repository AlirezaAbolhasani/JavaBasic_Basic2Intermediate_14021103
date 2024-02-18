package two;

/**
 * *Developer: ALireza Abolhasani
 * 1/24/2024
 * 11:55 AM
 **/
/*
1   INTCUSTID	        INTEGER 	N
2	BIRTHCITYCODE	    SMALLINT	N	0
3	ISSUECITYCODE	    SMALLINT	N	0
4	ISSUERGNCODE	    SMALLINT	Y
5	EDUCATION	        SMALLINT	Y
6	BIRTHDATE	        INTEGER	    N	0
7	ISSUEDATE       	INTEGER 	N	0
8	IDSERIAL	        INTEGER	    N	0
9	TIMEZ	            TIMESTAMP	N
10	HAVEMULTIACCOUNT	CHAR(1)	    N
11	SEX	                CHAR(1) 	N
12	NAME	            CHAR(30)	N
13	FAMILY	            CHAR(30)	N
14	IDNO	            CHAR(10)	Y
15	IDSERI          	CHAR(10)	N
16	FATHER	            VARCHAR(30)	Y
17	JOB	                VARCHAR(30)	Y
18	NATIONALCODE	    DECIMAL(12)	Y
19	OLDNATIONALCODE	    DECIMAL(10)	Y	0
20	FOLLOWCODE	        DECIMAL(10)	Y	0
21	SERIMELI	        VARCHAR(5)	Y	0
22	SERIALMELI	        VARCHAR(10)	Y	0
23	JOBCODE	            SMALLINT	N	0
24	JOBDATE         	INTEGER	N	0
25	INQFOLLOWCODE	    VARCHAR(50)	Y
26	STATUS	            INTEGER	Y
* */

public class Customer {

    private Integer intCustd;//    INTEGER
    private String name;//      CHAR(30)
    private String family;//  CHAR(30)

    public Integer getIntCustd() {
        return intCustd;
    }

    public void setIntCustd(Integer intCustd) {
        this.intCustd = intCustd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}