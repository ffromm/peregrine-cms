<template>
  <footer class="usa-footer usa-footer-slim" role="contentinfo" v-bind:data-per-path="model.path">
    <div class="usa-grid usa-footer-return-to-top">
      <a href="javascript:void(0);">Return to top</a>
    </div>
    <div class="usa-footer-primary-section">
      <div class="usa-grid">
        <nav class="usa-footer-nav usa-width-two-thirds">
          <ul class="usa-unstyled-list">
            <li class="usa-width-one-fourth usa-footer-primary-content">
              <a class="usa-footer-primary-link" href="javascript:void(0);">Primary link</a>
            </li>
            <li class="usa-width-one-fourth usa-footer-primary-content">
              <a class="usa-footer-primary-link" href="javascript:void(0);">Primary link</a>
            </li>
            <li class="usa-width-one-fourth usa-footer-primary-content">
              <a class="usa-footer-primary-link" href="javascript:void(0);">Primary link</a>
            </li>
            <li class="usa-width-one-fourth usa-footer-primary-content">
              <a class="usa-footer-primary-link" href="javascript:void(0);">Primary link</a>
            </li>
          </ul>
        </nav>
        <div class="usa-width-one-third">
          <div class="usa-footer-primary-content usa-footer-contact_info">
            <p>(800) CALL-GOVT</p>
          </div>
          <div class="usa-footer-primary-content usa-footer-contact_info">
            <a href="mailto:info@agency.gov">info@agency.gov</a>
          </div>
        </div>
      </div>
    </div>
    <div class="usa-footer-secondary_section">
      <div class="usa-grid">
        <div class="usa-footer-logo">
          <img class="usa-footer-slim-logo-img" src="/etc/felibs/uswds/img/logo-img.png"
          alt="Logo image">
          <h3 class="usa-footer-slim-logo-heading">Name of Agency</h3>
        </div>
      </div>
    </div>
  </footer>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

