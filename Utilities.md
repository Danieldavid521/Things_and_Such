# media tools
ffmpeg
on Windows, convert all files with .mp4, to .mp3
Download the .zip from here: https://www.gyan.dev/ffmpeg/builds/, then extract it, move the binary file to a certain location, then add it to your env path.
- for %f in (\*.mp4) do ffmpeg -i "%f" -c:a libmp3lame "%f.mp3"
- for i in \*.webm; do ffmpeg -i "$i" "${i%.*}.mp4"; done
- for file in *.mp4; do ffmpeg -i "$file" "${file%mp4}mp3"; done
- for /f "tokens=1 delims=." %a in ('dir /B *.webm') do ffmpeg -i "%a.webm" -vn -ab 128k -ar 44100 -y "%a.mp3"

# creating a concat file
# found that this exact command fails if there is a "'" in a filename in the directory
(for %i in (*.wav) do @echo file '%i') > mylist.txt
ffmpeg -f concat -safe 0 -i mylist.txt -c copy output.wav

#yt-dlp.exe -t mp3 "url"

# git
Git clone <url>
Cd to repo
Git checkout -b reason_for_update
*make changes*
Git add *
Git commit -m "comment for pull request"
Git push origin reason_for_update

# 7zip command line
7z a(add command) -t7z -r destinationlocation.7z sourcefiles\*.*

# network
NMAP
nmap -Pn IP
nmap -v 
(Verbose)
nmap -oN (text output) /file/location
nmap -A (aggressive)
-F top 100 used ports
