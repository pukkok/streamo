'use client'
import Link from 'next/link'

const NavMenu = () => (
  <nav className="flex gap-4 text-sm text-white">
    <Link href="/">홈</Link>
    <Link href="/genre">장르</Link>
    <Link href="/tv">티비</Link>
    <Link href="/movie">영화</Link>
  </nav>
)

export default NavMenu