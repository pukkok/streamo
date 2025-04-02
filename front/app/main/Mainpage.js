'use client'
import { useState } from 'react'
import SignModal from '../components/SignModal'

const MainPage = () => {
	const [signInModalOpen, setSignInModalOpen] = useState(false)

	const openSignModal = () => {
		// TODO: 모달창을 여는 로직
		console.log('로그인 버튼 클릭됨')
		setSignInModalOpen(true)
	}

	return (
		<div>
			<h1>Streamo 메인 페이지</h1>
			<p>Welcome to the main page!</p>
			<button onClick={openSignModal}>로그인</button>
			{signInModalOpen && <SignModal onClose={() => {setSignInModalOpen(false)}}/>}
		</div>
	)
}

export default MainPage