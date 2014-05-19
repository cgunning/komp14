#! /bin/sh
## shoutout to dj guseng ##
## remember to change username ##
filepath=`pwd`
echo "Working directory is "$filepath
cd ..
echo "Creating temporary folder and copying compiler"
ssh cgunning@u-shell.csc.kth.se 'mkdir ~/tmp/tmpkomp'
ssh cgunning@u-shell.csc.kth.se 'mkdir ~/tmp/tmpkomp/src'
scp -r $filepath/src cgunning@u-shell.csc.kth.se:~/tmp/tmpkomp/
ssh cgunning@u-shell.csc.kth.se 'mkdir ~/tmp/tmpkomp/lib'
scp -r $filepath/lib cgunning@u-shell.csc.kth.se:~/tmp/tmpkomp/
scp $filepath/DESC cgunning@u-shell.csc.kth.se:~/tmp/tmpkomp/DESC
scp $filepath/build.xml cgunning@u-shell.csc.kth.se:~/tmp/tmpkomp/build.xml
scp $filepath/report.pdf cgunning@u-shell.csc.kth.se:~/tmp/tmpkomp/report.pdf
scp $filepath/tigrissubmit.sh cgunning@u-shell.csc.kth.se:~/tmp/tmpkomp/tigrissubmit.sh
echo "--------------------------"
echo "Submitting to Tigris"
ssh cgunning@u-shell.csc.kth.se 'sh ~/tmp/tmpkomp/tigrissubmit.sh ~/tmp/tmpkomp'
 
echo "--------------------------"
 
echo "Deleting temporary folder"
ssh cgunning@u-shell.csc.kth.se 'rm -r ~/tmp/tmpkomp'
