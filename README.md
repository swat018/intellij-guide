# intellij-guide

intellij 가이드 (단축키)

[ 코드 Edit ]
1. 메인 메소드 생성 및 생성
* Gradle 이나 Maven 으로 생성하는 것을 추천
* ⌘ + n / alt + Insert: 디렉토리, 패키지, 클래스 등 생성 목록 보기
* 코드 템플릿
    - 메인 메소드: psvm
    - System.out.println(): sout
* 실행환경 실행
    - 현재 포커스: ⌃ + ⇧ + R / Shift + Ctrl + F10
    - 이전 실행: ⌃ + R /  Shift + F10
2. 라인 수정
* 라인 복사하기: ⌘ + D / Ctrl + D 
* 라인 삭제하기: ⌘ + ⌫ / Ctrl + Y
* 라인 합치기: ⌃ + ⇧ + J / Ctrl + Shift + J 
* 라인 단위로 옮기기
    - 구문 이동: ⇧ + ⌘ + ↑ ↓ / Shift + Ctrl + ↑ ↓ 
    - 라인 이동: ⇧ + ⌥ + ↑ ↓ / Shift + Alt + ↑ ↓ 
* Element 단위로 옮기기: ⌥ + ⇧ + ⌘ + ←→ / Alt + Ctrl + Shift + ←→ 
3. 즉시 보기
* 인자값 즉시 보기: ⌘ + P / Ctrl + P
* 코드 구현부 즉시 보기: ⌥ + ␣(space) / Shift + Ctrl + I
* Doc 즉시 보기: F1 / Ctrl + Q

[ 포커스 ]
1. 포커스 에디터
* 단어별 이동: ⌥ + ← → / Ctrl + ← → 
* 단어별 선택: ⇧ + ⌥ + ← → / Shift + Ctrl + ← →
* 라인 첫/끝 이동:  Fn + ← → / Home, End 
* 라인 전체 선택: ⇧ + ⌘ + ← → / Shift + Home, End 
* Page Up/Down: Fn + ↑ ↓ / Page Up, Down 
2. 포커스 특수키
* 포커스 범위 한 단계씩 늘리기: ⌥ + ↑ ↓ / Ctrl + W(위), Shift + Ctrl + W(아래)
* 포커스 뒤로/앞으로 가기: ⌘ + [  ] / Ctrl + Alt + ← →
* 멀티 포커스 : ⌥ + ⌥ + ↑ ↓ / Ctrl + Ctrl + ↑ ↓ 
* 오류 라인 자동 포커스 : F2 / F2

[ 검색 ]
1. 검색 - 텍스트
* 현재 파일에서 검색: ⌘ + F / Ctrl + F 
* 현재 파일에서 교체: ⌘ + R / Ctrl + R
* 전체에서 검색: ⌘ + ⇧ + F / Ctrl + Shift + F
* 전체에서 교체: ⌘ + ⇧ + R / Ctrl + Shift + R 
* 정규표현식으로 검색, 교체: Regex 체크 (https://jojoldu.tistory.com/160)
2. 검색 - 기타
* 파일 검색: ⌘ + ⇧ + O / Shift + Ctrl + N
* 메소드 검색: ⌥ + ⌘ + O / Shift + Ctrl + Alt + N
* Action 검색: ⇧ + ⌘ + A / Shift + Ctrl + A
* 최근 열었던 파일 목록 보기 :  ⌘ + E / Ctrl + E
* 최근 수정 했던 파일목록 보기: ⌘ + ⇧ + E / Ctrl + Shift + E

[ 자동완성 ]
1. 자동완성
* 스마트 자동완성: ⌃ + ⇧ + ␣(space) / Ctrl + Shift + ␣(space)
* 스태틱 메소드 자동완성: ⌃ + ␣(space) * 2 / Ctrl + Shift + ␣(space) * 2
* Getter/Setter/생성자 자동완성: ⌘ + N / Alt + Insert
* Override 메소드 자동완성: ⌃ + I / Ctrl + I
2. Live Template
* Live Template 목록 보기: ⌘ + J / Ctrl + J

[ 리펙토링 ]
1. 리펙토링 Extract
* 변수 추출하기: ⌘ + ⌥ + V / Ctrl + Alt + V
* 파라미터 추출하기: ⌘ + ⌥ + P / Ctrl + Alt + P
* 메소드 추출하기: ⌘ + ⌥ + M / Ctrl + Alt + M
* 이너클래스 추출하기: F6 / F6
2. 리펙토링 기타
* 이름 일괄 변경하기: ⇧ + F6 / Shift + F6
* 타입 일괄 변경하기: ⇧ + ⌘ + F6 / Shift + Ctrl + F6
* Import 정리하기: ⌃ + ⌥ + O / Ctrl + Alt + O
* 코드 자동 정렬하기: ⌘ +⌥ + L / Ctrl + Alt + L
 
[ 디버깅 ]
1. Debug 모드로 실행하기 (현재 위치의 메소드): ⌃ + ⇧ + D 
2. Debug 모드로 실행하기 (이전에 실행한 메소드):  ⌃ + D / Shift + F9 
3. Resume(다음 브레이크 포인트로 이동하기): ⌘ + ⌥  + R / F9
4. Step Over(현재 브레이크에서 다음 한줄로 이동하기): F8
5. Step Into(현재 브레이크의 다음 메소드로 이동): F7 
6. Step Out(현재 메소드의 밖으로 이동): ⇧ + F8 / Shift + F8 
7. Evaluate Expression (브레으크된 상태에서 코드 사용하기): ⌥ + F8 / Alt + F8
8. Watch(브레이크 이후의 코드 변경 확인하기)

[ Git & Github ]
1. Git
* Git View On: ⌘+ 9 / Alt + 9 
* Git Option Popup: ⌃ + V / Alt + `(Tab 위 버튼)
* Git History: ⌃ + V ⇢ 4 / Alt + `(Tab 위 버튼) ⇢ 4
* Branch: ⌃ + V ⇢ 7 / Alt + `(Tab 위 버튼) ⇢ 7
* Commit: ⌘ + K / Ctrl + K
* Push: ⌘ + ⇧ + K / Ctrl + Shift + K
* Pull: ⌘ + ⇧ + A ⇢ git pull / Ctrl + Shift + A ⇢ git pull
2. Github
* Github 연동하기: ⌘ + ⇧ + A ⇢ share GitHub / Ctrl + Shift + A ⇢ share github
* Github Clone

[ 플러그인 ]
1. 플러그인 설치
2. 추천 플러그인 
