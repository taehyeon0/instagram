import logo from './logo.svg';
import './App.css';

function App() {
    return (
        <main className="main">
            <article className="article">
                <div className="img">
                    <h1>여기가 이미지칸</h1>
                </div>
                <div className="login-wrap">
                    <h1>여기가 로그인창</h1>
                    <div className="login">
                        <div className="instagram-logo">
                            <h1>INSTAGRAM</h1>
                        </div>
                        <input className="user-id" placeholder="아이디"></input>
                        <input className="user-password" placeholder="비밀번호"></input>
                        <div className="login-button">로그인</div>
                        <div className="or-div">
                            <div>----</div>
                            <div>또는</div>
                            <div>----</div>
                        </div>
                        <div className="face-book-login">페이스북로그인</div>
                        <div className="password-finding">비밀번호를 잊으셨나요?</div>
                    </div>
                    <div className="sign-up-wrap">계정이 업으신가요? 가입하기</div>
                    <div>앱을 다운로드 하세요.</div>

                </div>
            </article>
        </main>
    );
}

export default App;
