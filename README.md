# Mobile_Software

### 개발환경
- MacOS 11.5.2
- Android Studio Arctic Fox | 2020.3.1 Patch 1
- Runtime version: 11.0.10+0-b96-7281165 x86_64

### 세팅
1. 자동 업데이트 기능 끄기
- Appearance & Behavior - System Settings - Updates에서 수정가능 
2. 소스 행번호 보이기
- Editor - General - Appearance 에서 Show line numbers 선택
3. SDK Manager
- Android 11.0(R)
- SDK Platform에서 Android SDK Platform 30과 Google APIs Intel x86 Atom System Image 체크
- SDK Tools에서 Google Play Services 체크
4. AVD 생성
- Tool - AVD Manger에서 Create Virtual Device
- Pixel 2 사용
- R[API 30, x86 Android 11.0(Google APIs)]선택
- 실행시키고 settings에서 한글설정, 맞춤법 검사 기능 끄기, 절전 모드 시간 늘리기 사용
5. build.gradle(Module)
- 애뮬레이터가 작동하지않으면 implementation 'androidx.appcompat:appcompat:1.3.0'로 버전을 낮추고 rebuild 
