import { useState } from 'react'
import Header from '../components/Header'
import SignModal from '../components/SignModal' // ← 이거 연결!
import HeroSection from '../components/hero/HeroSection'

const MainPage = () => {
  const [signInModalOpen, setSignInModalOpen] = useState(false)

  const openSignModal = () => {
    setSignInModalOpen(true)
  }

  const closeSignModal = () => {
    setSignInModalOpen(false)
  }

  return (
    <div className="">
      <Header onLoginClick={openSignModal} />
      
      {signInModalOpen && (
        <SignModal onClose={closeSignModal} />
      )}

      {/* 히어로 섹션 넣기 */}
      <HeroSection />
      {/* 카테고리 리스트 넣기 */}
    </div>
  )
}

export default MainPage