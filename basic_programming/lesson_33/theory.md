### Технология контроля версий разрабатываемого ПО Git

**Актуальность**
Сегодня программист без Git, как ковбой без лошади.
Очень часто перед собеседованием просят прислать ссылку на ваш Git, это часть портфолио.

**История:** 
Git создан Линусом Торвальдсом известным, как главный идеолог ОС Linux. 
Git был нужен для объединения усилий команд программистов, работающих в рамках одного проекта.
Сегодня Git используется как командами, так и индивидуальными программистами.
Git - в переводе с английского означает "мерзавец", это шутка Линуса в честь самого себя:
I'm an egotistical bastard, so I name all my projects after myself. First Linux, now git.

**Суть технологии:**
- **программист** ведет разработку **на своем локальном компьютере** (off line), все папки (директории) проекта и 
файлы помещаются в папку, содержание котоой отслеживает git - ЭТО **ЛОКАЛЬНЫЙ РЕПОЗИТОРИЙ**;

- для сохранения результатов работы используется **УДАЛЕННЫЙ РЕПОЗИТОРИЙ** (on line), куда отправляется
копия папки со всем ее содержимым когда программист:  
  1. фиксирует COMMIT (изменения в локальном репозитории) и 
  2. делает PUSH (отправку в удаленный репозиторий);

_________________________________________________________

- КЛЮЧЕВОЙ АЛГОРИТМ (know how): 
git умеет отслеживать все изменения, которые происходят в ЛОКАЛЬНОМ РЕПОЗИТОРИИ
с момента последней успешной синхронизации с УДАЛЕННЫМ РЕПОЗИТОРИЕМ:
  - названия папок, их расположение
  - название файлов
  - изменения в файлах (измения от 1 символа)
  - появление новых папок и файлов в них
  - и т.д.
_________________________________________________________

- **система контроля версий** - это **история сделанных COMMIT и PUSH**, можно возвращаться
на любую точку в прошлом, когда был сделанн COMMIT и PUSH.

__________________________________________________________

### РЕЗЮМЕ:
**Система контроля версий Git**
* Позволяет вести **индивидуальную разработку** с контролем версий для каждого прграммиста.
* Позволяет изолировать разработку внутри команды для каждого разработчика, 
если каждый член команды работает со своим файлом(ми).
* Позволяет вести **групповую разработку**, при условии понимания всех членов команды того,
как работает Git. 
* Распределенная система контроля версий Git - принцип один, но сервисы разные: 
  - GitHub, 
  - GitLab, 
  - Bitbucket,
  - ...

### ВАЖНО ПОНИМАТЬ
* главный (мастер) - репозиторий у разработчика на компьютере, то есть **у вас**
* удаленный репозиторий - это копия (слепок) с локального, сделанный в какой-то момент времени

**Вопрос:** можно ли изменить удаленный репозиторий и перенести (получить) эти изменения 
на своем компьютере в локальном репозитоии?
**Ответ:** да, это можно, команда pull "тянет" изменения из удаленного в локальный репозиторий

Именно это и **позволяет вести совместную работу нескольким программистам**, НО 
возможны конфликтты (риски). 

__________________________

### Ситуация 1
1. Разрботчик А внес изменения в файле, НО не сделал коммит и не сделал push.
2. Разработчик В внес изменения в этот же файл, но сделал коммит и сделал push.
3. Теперь азработчик А пытается сделать коммит и push.
Результат: Git не дает сделать push, а требует, чтобы разработчик А сначала сделал pull.
Возникает конфликт, Git показывает разницу в файлах и позволяет устранить конфликт.
____________________________

### Практикум
1. Регистрация на сайте https://github.com/
2. Создание своего облачного репозитория
3. Клонирование облачного репозитория на свой компьютер
4. Перенос своих рабочих папок и файлов в папку своего ЛОКАЛЬНОГО репозитория на компьютере
4. Модификация кода в репозитории (лекции и ДЗ) с помощью IDE IntellyJ IDEA
5. Выполнение commit и push из IDE IntellyJ IDEA, проверка состояния УДАЛЕННОГО репозитория
6. Предоставление ссылки на свой репозиторий при выполнении ДЗ
7. Актуализация локального репозитория с помощью команды pull
8. Конфликты при работе с репозиторием