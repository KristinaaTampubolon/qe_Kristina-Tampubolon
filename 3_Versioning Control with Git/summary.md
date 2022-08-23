# VERSION CONTROL and BRANCH MANAGEMENT (Git)

## Versioning

_Versioning_ artinya Melakukan pengaturan versi dan melacak perubahan source code program

_Tools_ :

- Version Control System  Tersentralasi/centralized
  Contoh : GIT (berkolaborasi antar developer)
- Source Code Manager (SCM)
- Revision Control System (RCS)

### GIT

_Git_ adalah salah satu version control system yang digunakan developer untuk mengembangkan softwara secara bersama - sama

- Git push : push ke repo
- Git fetch : Mengambil data tetapi belum di merge
- Git pull : Menarik data, mengambil perubahan dari master kemudian di merge ke branch

## BRANCHES

_Branches_ : mengisolasi perubahan-perubahan pada project

Bagaimana agar kolaborasi dapat berjalan dengan optimal :

1. Master : Undistributed master
2. Develop : Avoid edit on development
3. Feature :
   - Apply the feature to development only
   - Apply development to master when it’s done
