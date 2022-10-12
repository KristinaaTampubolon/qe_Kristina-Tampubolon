# Understanding Jmeter Results

#### Open JMeter

1. Open Terminal
2. navigate to bin folder
3. Run JMeter : jmeter

- REPORT

1. Summary Report
2. Aggregate Report
   Throughput = (number of rwquest) / (total time) \* conversation

dengan :
number of request : number of executed requests
total time : (lastSampleStartTime + lastSampleLoadTime - firstSampleStartTime)
