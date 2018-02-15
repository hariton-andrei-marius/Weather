$(document).ready(
	function()
	{
		// Side-nav
		$('.button-collapse').sideNav(
			{
				menuWidth: 135,
				edge: 'right',
				closeOnClick: true,
				draggable: true
			}
		);

		// Search button
		$('input[type="submit"]').addClass(
			'btn-large indigo darken-2'
			+ ' waves-effect waves-orange'
		);
	}
);
