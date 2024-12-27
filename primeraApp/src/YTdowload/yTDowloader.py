import yt_dlp as youtube_dl

def descargar_video(url):
    ydl_opts = {
        'format': 'best',
        'outtmpl': '%(title)s.%(ext)s',
    }
    with youtube_dl.YoutubeDL(ydl_opts) as ydl:
        ydl.dowload([url])

url = "https://www.youtube.com/watch?v=YVkUvmDQ3HY"
descargar_video(url)