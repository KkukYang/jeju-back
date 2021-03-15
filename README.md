# 일상제주 - Back
2021.01.09 ~ 2021.02.15

## 프로젝트 소개
한 곳의 사이트에서 제주도의 관광명소와 주변 맛집을 소개하고, 회원 추천식당, 회원 일정 공유, 교통편 정보 등을 통하여 다양한 정보를 공유하고 자신만의 일정을 기록하여 여행객의 수월한 관광을 돕는 웹 사이트

## Team
* **PL** 김상희<br/>
* **Front-end** 김소연, 안현서, 양국현, 양호준<br/>
* **Back-end** 김상희, 성석우, 오상근<br/>

## Stack
* **Front-end** [Front-end 저장소](https://github.com/KkukYang/jeju-front "front")
* **Back-end** : Spring boot, Java, MySQL, Mybatis, Maven
* **Open API** : Jeju Visit api, 공공 데이터 포털(기상청), 제주도 렌터카 api
* **Tool** : Eclipse, InteilliJ, AWS, RDS, EC2, FileZilla, TortoiseGit, SourceTree, MySQL workbench, Apache Tomcat 9.0, Postman

## 기능
### Main
* main home
<img src="https://user-images.githubusercontent.com/55429998/111215788-e4258a00-8616-11eb-91a9-962f04e7a9e7.png" width="800" height="300">
* 검색창을 통해서 관광지를 검색할 수 있다.<br/>
* 원하는 제주도 지역을 선택하여 날씨를 확인할 수 있다.
<img src="https://user-images.githubusercontent.com/55429998/111215914-0d461a80-8617-11eb-8d12-46cb216c5a97.png" width="800" height="300">
* 지도의 지역을 선택하면 인기 관광지 다섯개를 확인할 수 있다.
<img src="https://user-images.githubusercontent.com/55429998/111216043-41214000-8617-11eb-9b34-c65629b0b21e.png" width="800" height="300">
* 카테고리별 최신글을 확인할 수 있다.
<img src="https://user-images.githubusercontent.com/55429998/111216603-f7852500-8617-11eb-926f-338e2d08d79b.png" width="500" height="200">
<br/>

### 회원가입<br/>
```
POST / users
```
* Request
```
{
}
```
* Response
```
{}
```
